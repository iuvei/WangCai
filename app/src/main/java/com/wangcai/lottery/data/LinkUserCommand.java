package com.wangcai.lottery.data;

import com.android.volley.Request;
import com.wangcai.lottery.base.net.RequestConfig;

@RequestConfig(api = "service?packet=User&action=LinkUser", method = Request.Method.POST)
public class LinkUserCommand extends CommonAttribute
{
    private int prize_group_type = 2;
    private int prize_group_id = 0;
    private String fb_single="0";
    private String fb_all="0";
    private String ag_percent="0";
    private String ga_percent="0";
    private int is_agent;
    private int valid_days;
    private String channel;
    private String agent_qqs;
    private String series_prize_group_json;
    private String agent_prize_set_quota;

    public int getPrize_group_type() {
        return prize_group_type;
    }

    public void setPrize_group_type(int prize_group_type) {
        this.prize_group_type = prize_group_type;
    }

    public int getPrize_group_id() {
        return prize_group_id;
    }

    public void setPrize_group_id(int prize_group_id) {
        this.prize_group_id = prize_group_id;
    }

    public String getFb_single() {
        return fb_single;
    }

    public void setFb_single(String fb_single) {
        this.fb_single = fb_single;
    }

    public String getFb_all() {
        return fb_all;
    }

    public void setFb_all(String fb_all) {
        this.fb_all = fb_all;
    }

    public String getAg_percent() {
        return ag_percent;
    }

    public void setAg_percent(String ag_percent) {
        this.ag_percent = ag_percent;
    }

    public String getGa_percent() {
        return ga_percent;
    }

    public void setGa_percent(String ga_percent) {
        this.ga_percent = ga_percent;
    }

    public int getIs_agent()
    {
        return is_agent;
    }
    
    public void setIs_agent(int is_agent)
    {
        this.is_agent = is_agent;
    }
    
    public int getValid_days()
    {
        return valid_days;
    }
    
    public void setValid_days(int valid_days)
    {
        this.valid_days = valid_days;
    }
    
    public String getChannel()
    {
        return channel;
    }
    
    public void setChannel(String channel)
    {
        this.channel = channel;
    }
    
    public String getAgent_qqs()
    {
        return agent_qqs;
    }
    
    public void setAgent_qqs(String agent_qqs)
    {
        this.agent_qqs = agent_qqs;
    }
    
    public String getSeries_prize_group_json()
    {
        return series_prize_group_json;
    }
    
    public void setSeries_prize_group_json(String series_prize_group_json)
    {
        this.series_prize_group_json = series_prize_group_json;
    }
    
    public String getAgent_prize_set_quota()
    {
        return agent_prize_set_quota;
    }
    
    public void setAgent_prize_set_quota(String agent_prize_set_quota)
    {
        this.agent_prize_set_quota = agent_prize_set_quota;
    }
}
