package com.lansmancai.rpcv5.client;


import com.lansmancai.rpcv5.common.RPCRequest;
import com.lansmancai.rpcv5.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
