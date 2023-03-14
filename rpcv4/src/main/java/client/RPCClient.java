package com.lansmancai.rpcv4.client;


import com.lansmancai.rpcv4.common.RPCRequest;
import com.lansmancai.rpcv4.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
