---
title: "PortalsPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.portals"
fqcn: "com.hypixel.hytale.builtin.portals.PortalsPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals`

```java
public class PortalsPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `PortalsPlugin` | `instance` |
| `private` | `ResourceType<EntityStore,PortalWorld>` | `portalResourceType` |
| `private` | `ComponentType<ChunkStore,PortalDevice>` | `portalDeviceComponentType` |
| `private` | `ComponentType<EntityStore,VoidEvent>` | `voidEventComponentType` |
| `private` | `ComponentType<EntityStore,VoidSpawner>` | `voidPortalComponentType` |
| `public static final` | `int` | `MAX_CONCURRENT_FRAGMENTS` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `PortalsPlugin` | `getInstance()` |
| `@Override protected` | `void` | `setup()` |
| `private` | `void` | `turnOffPortalWhenWorldRemoved(RemoveWorldEvent event)` |
| `public` | `int` | `countActiveFragments()` |
| `public` | `ResourceType<EntityStore,PortalWorld>` | `getPortalResourceType()` |
| `public` | `ComponentType<ChunkStore,PortalDevice>` | `getPortalDeviceComponentType()` |
| `public` | `ComponentType<EntityStore,VoidEvent>` | `getVoidEventComponentType()` |
| `public` | `ComponentType<EntityStore,VoidSpawner>` | `getVoidPortalComponentType()` |
