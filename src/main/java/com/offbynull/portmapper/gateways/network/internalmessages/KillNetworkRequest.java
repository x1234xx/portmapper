/*
 * Copyright (c) 2013-2016, Kasra Faghihi, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.offbynull.portmapper.gateways.network.internalmessages;

/**
 * Kill the network gateway. There is no response to this message, the network gateway closes all sockets and shuts down after receiving
 * this message.
 * @author Kasra Faghihi
 */
public final class KillNetworkRequest implements NetworkRequest {

    @Override
    public String toString() {
        return "KillNetworkRequest{" + '}';
    }
    
}