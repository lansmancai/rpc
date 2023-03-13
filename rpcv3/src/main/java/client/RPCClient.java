package com.lansmancai.rpcv3.client;


import com.lansmancai.rpcv3.common.RPCRequest;
import com.lansmancai.rpcv3.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
