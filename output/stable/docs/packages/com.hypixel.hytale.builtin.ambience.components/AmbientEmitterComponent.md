---
title: "AmbientEmitterComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience.components"
fqcn: "com.hypixel.hytale.builtin.ambience.components.AmbientEmitterComponent"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "ambience"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.ambience.components`

```java
public class AmbientEmitterComponent implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<AmbientEmitterComponent>` | `CODEC` |
| `private` | `String` | `soundEventId` |
| `private` | `Ref<EntityStore>` | `spawnedEmitter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,AmbientEmitterComponent>` | `getComponentType()` |
| `public` | `String` | `getSoundEventId()` |
| `public` | `void` | `setSoundEventId(String soundEventId)` |
| `public` | `Ref<EntityStore>` | `getSpawnedEmitter()` |
| `public` | `void` | `setSpawnedEmitter(Ref<EntityStore> spawnedEmitter)` |
| `@Nullable @Override public` | `Component<EntityStore>` | `clone()` |
