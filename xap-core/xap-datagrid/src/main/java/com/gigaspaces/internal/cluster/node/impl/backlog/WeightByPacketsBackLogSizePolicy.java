package com.gigaspaces.internal.cluster.node.impl.backlog;

import com.gigaspaces.internal.cluster.node.impl.packets.data.IReplicationPacketData;

/**
 * @author Boris
 * @since 12.1.0
 */
public class WeightByPacketsBackLogSizePolicy implements BackLogSizePolicy {

    @Override
    public int calculateWeight(IReplicationPacketData<?> data) {
        return 1;
    }
}
