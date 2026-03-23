---
title: "EntityRegistration"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.EntityRegistration"
api_surface: true
extends: "Registration"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class EntityRegistration extends Registration
```

A registration handle returned when a plugin registers a custom entity type via [EntityRegistry](EntityRegistry.md). Extends `Registration` (which provides `isEnabled`, `unregister`, and `isRegistered` state management) with the entity's class reference. The registration remains valid as long as the owning plugin is enabled.

## Constructors

```java
public EntityRegistration(Class<? extends Entity> entityClass, BooleanSupplier isEnabled, Runnable unregister)
```

Constructs a registration for the given entity class with the specified enabled-check and unregister callback.

```java
public EntityRegistration(@Nonnull EntityRegistration registration, BooleanSupplier isEnabled, Runnable unregister)
```

Copy constructor that creates a new registration handle wrapping the same entity class from an existing registration, with new lifecycle callbacks. Used internally by the `Registry` base class to create plugin-scoped copies.

## Methods

```java
public Class<? extends Entity> getEntityClass()
```

Returns the entity class associated with this registration.

```java
@Nonnull
@Override
public String toString()
```

Returns a string representation including the entity class and the base `Registration` state.

## Related Types

- [EntityRegistry](EntityRegistry.md) -- the registry that produces these registration handles
- [EntityModule](EntityModule.md) -- creates registrations in `registerEntity()`
- `Registration` -- base class providing enabled/unregister lifecycle
- `Entity` -- the base entity type referenced by the registration
