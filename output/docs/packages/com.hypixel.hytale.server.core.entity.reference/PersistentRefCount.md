---
title: "PersistentRefCount"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.reference"
fqcn: "com.hypixel.hytale.server.core.entity.reference.PersistentRefCount"
api_surface: false
extends: null
implements: ["Component"]
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
public class PersistentRefCount implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PersistentRefCount>` | `CODEC` |
| `private` | `int` | `refCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,PersistentRefCount>` | `getComponentType()` |
| `public` | `int` | `get()` |
| `public` | `void` | `increment()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
