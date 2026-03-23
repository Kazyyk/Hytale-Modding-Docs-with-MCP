---
title: "CreativeHubEntityConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.creativehub.config"
fqcn: "com.hypixel.hytale.builtin.creativehub.config.CreativeHubEntityConfig"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "creativehub"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.creativehub.config`

```java
public class CreativeHubEntityConfig implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<CreativeHubEntityConfig>` | `CODEC` |
| `private` | `UUID` | `parentHubWorldUuid` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore,CreativeHubEntityConfig>` | `getComponentType()` |
| `@Nonnull public static` | `CreativeHubEntityConfig` | `ensureAndGet(Holder<EntityStore> holder)` |
| `@Nullable public static` | `CreativeHubEntityConfig` | `get(Holder<EntityStore> holder)` |
| `@Nullable public` | `UUID` | `getParentHubWorldUuid()` |
| `public` | `void` | `setParentHubWorldUuid(UUID parentHubWorldUuid)` |
| `@Nonnull public` | `CreativeHubEntityConfig` | `clone()` |
