---
title: "PersistentRef"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.reference"
fqcn: "com.hypixel.hytale.server.core.entity.reference.PersistentRef"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "reference"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.reference`

```java
public class PersistentRef
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PersistentRef>` | `CODEC` |
| `protected` | `UUID` | `uuid` |
| `protected` | `Ref<EntityStore>` | `reference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `UUID` | `getUuid()` |
| `public` | `void` | `setUuid(UUID uuid)` |
| `public` | `void` | `setEntity(Ref<EntityStore> ref, UUID uuid)` |
| `public` | `void` | `setEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `clear()` |
| `public` | `boolean` | `isValid()` |
| `@Nullable public` | `Ref<EntityStore>` | `getEntity(ComponentAccessor<EntityStore> componentAccessor)` |
| `protected` | `boolean` | `validateEntityReference(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
