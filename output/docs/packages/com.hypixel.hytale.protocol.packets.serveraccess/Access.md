---
title: "Access"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.serveraccess"
fqcn: "com.hypixel.hytale.protocol.packets.serveraccess.Access"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "protocol"
  - "packets"
  - "serveraccess"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol.packets.serveraccess`

```java
public enum Access
```

## Enum Constants

| Constant |
|---|
| `Private` |
| `LAN` |
| `Friend` |
| `Open` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Access[]` | `VALUES` |
| `private final` | `int` | `value` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `Access(int value)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getValue()` |
| `public static` | `Access` | `fromValue(int value)` |
