package com.gigaspaces.internal.cluster.node.impl.backlog;

/**
 * @author Boris
 * @since 12.1.0
 */
public class BackLogSizePolicyFactory {
    public static BackLogSizePolicy create(String policy) {
        if (policy.equalsIgnoreCase("weight-by-packets")) {
            return new WeightByPacketsBackLogSizePolicy();
        }
        else if (policy.equalsIgnoreCase("weight-by-operations")){
            return new WeightByOperationsBackLogSizePolicy();
        }
        else {
            throw new UnsupportedOperationException("No such backlog size policy named: " + policy);
        }
    }
}
