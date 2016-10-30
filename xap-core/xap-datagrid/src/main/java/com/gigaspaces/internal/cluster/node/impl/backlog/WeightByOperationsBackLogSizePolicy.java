package com.gigaspaces.internal.cluster.node.impl.backlog;

import com.gigaspaces.internal.cluster.node.impl.packets.data.IReplicationPacketData;

/**
 * @author Boris
 * @since 12.1.0
 */
public class WeightByOperationsBackLogSizePolicy implements BackLogSizePolicy {

    @Override
    public int calculateWeight(IReplicationPacketData<?> data) {
        //System.out.println("CALCULATED WEIGHT= " + data.size());
        return data.size();
    }
}
