---
title: "PortalDevice"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.components"
fqcn: "com.hypixel.hytale.builtin.portals.components.PortalDevice"
api_surface: false
extends: null
implements: ["Component"]
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
public class PortalDevice implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PortalDevice>` | `CODEC` |
| `private` | `PortalDeviceConfig` | `config` |
| `private` | `String` | `baseBlockTypeKey` |
| `private` | `UUID` | `destinationWorldUuid` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore,PortalDevice>` | `getComponentType()` |
| `public` | `PortalDeviceConfig` | `getConfig()` |
| `public` | `String` | `getBaseBlockTypeKey()` |
| `@Nullable public` | `BlockType` | `getBaseBlockType()` |
| `@Nullable public` | `UUID` | `getDestinationWorldUuid()` |
| `@Nullable public` | `World` | `getDestinationWorld()` |
| `public` | `void` | `setDestinationWorld(World world)` |
| `@Override public` | `Component<ChunkStore>` | `clone()` |
