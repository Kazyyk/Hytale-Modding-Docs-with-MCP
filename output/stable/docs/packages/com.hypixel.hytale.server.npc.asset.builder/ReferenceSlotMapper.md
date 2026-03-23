---
title: "ReferenceSlotMapper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.ReferenceSlotMapper"
api_surface: false
extends: "SlotMapper"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class ReferenceSlotMapper<T> extends SlotMapper
```

Extends [SlotMapper](SlotMapper.md) to associate each slot with a lazily-created reference object. When a slot is requested, if it does not already have an associated object, one is created via the provided `Supplier<T>`. Used by [BuilderSupport](BuilderSupport.md) for timer slots.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The reference object type (e.g., `Timer`). |

## Constructors

```java
public ReferenceSlotMapper(Supplier<T> slotSupplier)
public ReferenceSlotMapper(Supplier<T> slotSupplier, boolean trackNames)
```

## Methods

### getReference

```java
public T getReference(String name)
```

Returns the reference object for the named slot, creating it on first access.

### getReferenceList

```java
public List<T> getReferenceList()
```

Returns the list of all created reference objects.

## Related Types

- [SlotMapper](SlotMapper.md) -- parent class
- [BuilderSupport](BuilderSupport.md) -- uses this for timer allocation
