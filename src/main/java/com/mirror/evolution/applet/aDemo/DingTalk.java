package com.mirror.evolution.applet.aDemo;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.*;
import com.dingtalk.api.response.*;
import com.taobao.api.ApiException;

import java.util.Arrays;

/**
 * Created by mirrordingjing @ 2020/9/2
 */
public class DingTalk {
    public static void main(String[] args) throws ApiException {

        DefaultDingTalkClient acClient = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest acRequest = new OapiGettokenRequest();
        acRequest.setAppkey("dingdsad7k9daqcx7abv");
        acRequest.setAppsecret("mbhyausCUkEZdqruhLmbs-hjY_r7EgCtH1rxXCaQ5DzgMhrfv82kX2zZ17QO3FJD");
        acRequest.setHttpMethod("GET");
        OapiGettokenResponse acResponse = acClient.execute(acRequest);

//        DingTalkClient listClient = new DefaultDingTalkClient("https://oapi.dingtalk.com/department/list");
//        OapiDepartmentListRequest listRequest = new OapiDepartmentListRequest();
//        listRequest.setId("1");
//        listRequest.setHttpMethod("GET");
//        listRequest.setFetchChild(true);
//        OapiDepartmentListResponse listResponse = listClient.execute(listRequest, acResponse.getAccessToken());
//        System.out.println(listResponse.toString());
//        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/role/list");
//        OapiRoleListRequest request = new OapiRoleListRequest();
//        request.setOffset(0L);
//        request.setSize(10L);
//
//        OapiRoleListResponse response = client.execute(request, acResponse.getAccessToken());

//        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/simplelist");
//        OapiUserSimplelistRequest request = new OapiUserSimplelistRequest();
//        request.setDepartmentId(134362586L);
//        request.setOffset(0L);
//        request.setSize(10L);
//        request.setHttpMethod("GET");
//
//        OapiUserSimplelistResponse response = client.execute(request, acResponse.getAccessToken());

        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/attendance/listRecord");
        OapiAttendanceListRecordRequest request = new OapiAttendanceListRecordRequest();
        request.setCheckDateFrom("2020-09-01 00:00:00");
        request.setCheckDateTo("2020-09-03 00:00:00");
        request.setUserIds(Arrays.asList("1466033842946932"));
        OapiAttendanceListRecordResponse execute = client.execute(request,acResponse.getAccessToken());

        System.out.println("hello");
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int n=dungeon.length;
        if(n==0) return 0;
        int m=dungeon[0].length;
        int[][] dp=new int[n][m];
        dp[n-1][m-1]=Math.max(1,1-dungeon[n-1][m-1]);
        for(int i=m-2;i>=0;i--){
            dp[n-1][i]=Math.max(1,dp[n-1][i+1]-dungeon[n-1][i]);
        }
        for(int i=n-2;i>=0;i--){
            dp[i][m-1]=Math.max(1,dp[i+1][m-1]-dungeon[i][m-1]);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                //int right=Math.max(1,1-dungeon[i][j+1]);
                //int down=Math.max(1,1-dungeon[i+1][j]);
                //dp[i][j]=Math.min(right,down);
                dp[i][j]=Math.max(1,Math.min(dp[i+1][j]-dungeon[i][j],dp[i][j+1]-dungeon[i][j]));
            }
        }
        return dp[0][0];
    }

    class Solution {
        public int calculateMinimumHP(int[][] dungeon) {
            int n=dungeon.length;
            if(n==0) return 0;
            int m=dungeon[0].length;
            int[] cur=new int[m+1];
            int[] dp=new int[m+1];
            for(int i=1;i<=m;i++){
                cur[i]=Integer.MIN_VALUE;
                dp[i]=Integer.MIN_VALUE;
            }
            for(int i=0;i<n;i++){
                int[] tmp=new int[m+1];
                for(int j=0;j<m;j++){
                    cur[j+1]=Math.max(cur[j],cur[j+1])+dungeon[i][j];
                    dp[j+1]=Math.min(Math.max(dp[j],dp[j+1]),cur[j+1]);
                }
                if(i==0){
                    cur[0]=Integer.MIN_VALUE;
                    dp[0]=Integer.MIN_VALUE;
                }
                for(int j=1;j<=m;j++){
                    System.out.print(dp[j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            return -dp[m]+1;
        }
    }

}
