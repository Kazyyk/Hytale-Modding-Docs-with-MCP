---
title: "ServerManager"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.ServerManager"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "server"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public class ServerManager extends JavaPlugin
```

Core plugin responsible for managing the server's network transport layer. Handles binding/unbinding listeners on TCP or QUIC transports, managing sub-packet handlers, and coordinating the server startup/shutdown lifecycle for networking. Implements the singleton pattern via `get()`.

## Static Methods

```java
public static ServerManager get()
```

## Constructors

```java
public ServerManager(@Nonnull JavaPluginInit init)
```

## Instance Methods

```java
public void init()
```

Initializes the transport layer asynchronously based on the configured transport type (TCP or QUIC).

```java
public boolean bind(@Nonnull InetSocketAddress address)
```

Binds a listener to the given address. For QUIC with wildcard addresses, binds IPv4, IPv6, and IPv6 localhost separately.

```java
public boolean unbind(@Nonnull Channel channel)
```

```java
public void unbindAllListeners()
```

```java
public List<Channel> getListeners()
```

```java
public InetSocketAddress getLocalOrPublicAddress()
```

```java
public InetSocketAddress getNonLoopbackAddress()
```

```java
public InetSocketAddress getPublicAddress()
```

```java
public void waitForBindComplete()
```

```java
public void registerSubPacketHandlers(@Nonnull Function<IPacketHandler, SubPacketHandler> supplier)
```

```java
public void populateSubPacketHandlers(@Nonnull GamePacketHandler packetHandler)
```
