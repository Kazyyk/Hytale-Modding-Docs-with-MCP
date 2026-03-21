---
title: "NetworkSerializers"
kind: "interface"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.NetworkSerializers"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "serialization"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public interface NetworkSerializers
```

Container for shared [NetworkSerializer](NetworkSerializer.md) instances used across the networking layer.

## Constants

```java
NetworkSerializer<Box, Hitbox> BOX
```

Serializer that converts a `Box` math shape into a `Hitbox` protocol packet by extracting the min/max XYZ float coordinates.
