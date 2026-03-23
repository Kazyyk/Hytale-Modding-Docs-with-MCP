---
title: "NonTicking"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.NonTicking"
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
public class NonTicking<ECS_TYPE> implements Component<ECS_TYPE>
```

A marker component that excludes an entity from tick processing. When present in an entity's archetype, ticking systems skip the entity. The component is a singleton.

## Methods

```java
public static <ECS_TYPE> NonTicking<ECS_TYPE> get()
```

Returns the singleton instance.

## Related Types

- [NonSerialized](NonSerialized.md) -- the equivalent marker for disabling serialization
- [ComponentRegistry](ComponentRegistry.md) -- registers the NonTicking type at construction
