---
title: "Packet"
kind: "interface"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Packet"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public interface Packet
```

Core packet interface. Defines getId(), getChannel(), serialize(ByteBuf), computeSize(). All network messages implement this.

## Methods

```java
int getId()
```

```java
NetworkChannel getChannel()
```

```java
void serialize(@Nonnull ByteBuf var1)
```

```java
int computeSize()
```
