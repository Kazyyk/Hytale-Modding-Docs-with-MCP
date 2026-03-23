---
title: "InvalidatablePersistentRef"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.reference"
fqcn: "com.hypixel.hytale.server.core.entity.reference.InvalidatablePersistentRef"
api_surface: false
extends: "PersistentRef"
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
public class InvalidatablePersistentRef extends PersistentRef
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<InvalidatablePersistentRef>` | `CODEC` |
| `protected` | `int` | `refCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `setEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `clear()` |
| `public` | `void` | `setRefCount(int refCount)` |
| `public` | `int` | `getRefCount()` |
| `@Override protected` | `boolean` | `validateEntityReference(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
