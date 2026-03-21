---
title: "ProtocolVersion"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.ProtocolVersion"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "protocol"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public class ProtocolVersion
```

Immutable value object representing a protocol version identified by a CRC checksum. Two `ProtocolVersion` instances are equal if and only if their CRC values match.

## Constructors

```java
public ProtocolVersion(int crc)
```

## Instance Methods

```java
public int getCrc()
```

Returns the CRC checksum identifying this protocol version.

```java
public boolean equals(@Nullable Object o)
```

```java
public int hashCode()
```

```java
public String toString()
```
