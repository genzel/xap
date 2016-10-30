package com.gigaspaces.internal.cluster.node.impl.backlog;

import com.gigaspaces.internal.cluster.node.impl.packets.data.IReplicationPacketData;

/**
 * @author Boris
 * @since 12.1.0
 */
public interface BackLogSizePolicy {
    int calculateWeight(IReplicationPacketData<?> data);
}
