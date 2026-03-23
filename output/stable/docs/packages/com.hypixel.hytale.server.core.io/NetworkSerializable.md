---
title: "NetworkSerializable"
kind: "interface"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.NetworkSerializable"
api_surface: true
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
public interface NetworkSerializable<Packet>
```

Generic interface for objects that can convert themselves into a network packet representation.

## Type Parameters

- `Packet` -- the packet type this object serializes to.

## Methods

```java
Packet toPacket()
```

Converts this object into its packet representation for network transmission.
