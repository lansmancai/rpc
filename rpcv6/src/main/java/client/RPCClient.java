package com.lansmancai.rpcv6.client;


import com.lansmancai.rpcv6.common.RPCRequest;
import com.lansmancai.rpcv6.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
