---
title: "PortalDeviceConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.components"
fqcn: "com.hypixel.hytale.builtin.portals.components.PortalDeviceConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.components`

```java
public class PortalDeviceConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PortalDeviceConfig>` | `CODEC` |
| `private` | `String` | `onState` |
| `private` | `String` | `spawningState` |
| `private` | `String` | `offState` |
| `private` | `String` | `returnBlock` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getOnState()` |
| `public` | `String` | `getSpawningState()` |
| `public` | `String` | `getOffState()` |
| `@Nullable public` | `String` | `getReturnBlock()` |
| `@Nonnull public` | `String[]` | `getBlockStates()` |
| `public` | `boolean` | `areBlockStatesValid(BlockType baseBlockType)` |
