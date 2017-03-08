/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincheck;

import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class BankAccount {

    private CoinCheck client;
    
    public BankAccount(CoinCheck client) {
        this.client = client;
    }
    
     /**
     * Create a new BankAccount.
     *
     * @param params
     * @throws java.lang.Exception
     * 
     * @return JSONObject
     */
    public JSONObject create(List<NameValuePair> params) throws Exception {
        String response = this.client.sendPost("api/bank_accounts", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }
    
    /**
     * Get account information.
     *
     * @param params
     * @throws java.lang.Exception
     * 
     * @return JSONObject
     */
    public JSONObject all(Map<String, String> params) throws Exception {
        String response = this.client.sendGet("api/bank_accounts", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }
    
    /**
     * Delete a BankAccount.
     *
     * @param params
     * @throws java.lang.Exception
     * 
     * @return JSONObject
     */
    public JSONObject delete(Map<String, String> params) throws Exception {
        String response = this.client.sendGet("api/bank_accounts", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }
    
}
