---
title: "NetworkSerializer"
kind: "interface"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.NetworkSerializer"
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
@FunctionalInterface
public interface NetworkSerializer<Type, Packet>
```

Functional interface that converts a domain object into a network packet. Unlike [NetworkSerializable](NetworkSerializable.md), this is an external converter rather than a self-serializing pattern.

## Type Parameters

- `Type` -- the source domain object type.
- `Packet` -- the target packet type.

## Methods

```java
Packet toPacket(Type var1)
```

Converts the given domain object into its packet representation.
