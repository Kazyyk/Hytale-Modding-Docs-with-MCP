---
title: "NonSerialized"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.NonSerialized"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Component<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class NonSerialized<ECS_TYPE> implements Component<ECS_TYPE>
```

A marker component that prevents an entity from being serialized. When present in an entity's archetype, the entity is excluded from persistence operations (`hasSerializableComponents()` returns `false`, `getSerializableArchetype()` returns empty). The component is a singleton.

## Methods

```java
public static <ECS_TYPE> NonSerialized<ECS_TYPE> get()
```

Returns the singleton instance.

## Related Types

- [NonTicking](NonTicking.md) -- the equivalent marker for disabling tick processing
- [Archetype](Archetype.md) -- checks for NonSerialized in `hasSerializableComponents()`
