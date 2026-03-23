---
title: "com.hypixel.hytale.component"
kind: "package"
package: "com.hypixel.hytale.component"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
  - "core"
---

**Package:** `com.hypixel.hytale.component`

The core ECS (Entity Component System) framework for Hytale. This package provides the fundamental building blocks for all gameplay data: entities are collections of [Component](Component.md) instances organized into [Archetype](Archetype.md) groups, stored in [Store](Store.md) containers, and processed by registered systems. The framework supports two store types -- `EntityStore` for entities (players, NPCs, flocks) and `ChunkStore` for world chunks.

Key architectural concepts:
- **Archetype-based storage** -- entities with identical component sets share an [ArchetypeChunk](ArchetypeChunk.md), enabling cache-friendly iteration
- **Deferred mutations** -- systems use [CommandBuffer](CommandBuffer.md) to queue structural changes, preventing concurrent modification during iteration
- **Type-safe handles** -- [ComponentType](ComponentType.md), [ResourceType](ResourceType.md), and [SystemType](SystemType.md) are generic handles that provide compile-time safety
- **Plugin lifecycle integration** -- [ComponentRegistryProxy](ComponentRegistryProxy.md) auto-unregisters plugin types on shutdown

## Core Types

| Type | Kind | Description |
|---|---|---|
| [Store](Store.md) | class | Central ECS data container holding entities, components, and resources. |
| [ComponentRegistry](ComponentRegistry.md) | class | Registry managing all ECS type registrations and maintaining stores. |
| [IComponentRegistry](IComponentRegistry.md) | interface | Plugin-facing registration interface. |
| [ComponentRegistryProxy](ComponentRegistryProxy.md) | class | Plugin-scoped proxy with automatic unregistration on shutdown. |

## Entity Data Types

| Type | Kind | Description |
|---|---|---|
| [Component](Component.md) | interface | Root interface for all per-entity ECS data. |
| [Resource](Resource.md) | interface | Root interface for per-store singleton data. |
| [Archetype](Archetype.md) | class | Immutable set of ComponentTypes defining an entity shape. |
| [ArchetypeChunk](ArchetypeChunk.md) | class | Columnar storage for entities sharing the same archetype. |

## Handle Types

| Type | Kind | Description |
|---|---|---|
| [ComponentType](ComponentType.md) | class | Typed handle for a registered component; also usable as a Query. |
| [ResourceType](ResourceType.md) | class | Typed handle for a registered resource. |
| [SystemType](SystemType.md) | class | Typed handle for a system category. |
| [SystemGroup](SystemGroup.md) | class | Groups systems for dependency-based execution ordering. |

## Entity References

| Type | Kind | Description |
|---|---|---|
| [Ref](Ref.md) | class | Lightweight O(1) entity reference handle. |
| [Holder](Holder.md) | class | Portable entity data container for add/remove/serialize operations. |
| [WeakComponentReference](WeakComponentReference.md) | class | Weak reference to a specific component on a specific entity. |

## Command and Access

| Type | Kind | Description |
|---|---|---|
| [CommandBuffer](CommandBuffer.md) | class | Deferred command queue for safe mutations during system processing. |
| [ComponentAccessor](ComponentAccessor.md) | interface | Unified read/write interface implemented by Store and CommandBuffer. |

## Registration Records

| Type | Kind | Description |
|---|---|---|
| [ComponentRegistration](ComponentRegistration.md) | record | Full metadata record for a registered component type. |
| [ResourceRegistration](ResourceRegistration.md) | record | Full metadata record for a registered resource type. |

## Lifecycle Enums

| Type | Kind | Description |
|---|---|---|
| [AddReason](AddReason.md) | enum | `SPAWN` or `LOAD` -- why an entity is being added. |
| [RemoveReason](RemoveReason.md) | enum | `REMOVE` or `UNLOAD` -- why an entity is being removed. |

## Marker Components

| Type | Kind | Description |
|---|---|---|
| [NonSerialized](NonSerialized.md) | class | Marker component preventing entity serialization. |
| [NonTicking](NonTicking.md) | class | Marker component excluding entity from tick processing. |

## Resource Storage

| Type | Kind | Description |
|---|---|---|
| [IResourceStorage](IResourceStorage.md) | interface | Persistence interface for loading/saving resources. |
| [EmptyResourceStorage](EmptyResourceStorage.md) | class | No-op implementation for non-persistent stores. |

## Query Types

| Type | Kind | Description |
|---|---|---|
| [ReadWriteQuery](ReadWriteQuery.md) | class | Query distinguishing read-only from read-write component access. |

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [DisableProcessingAssert](DisableProcessingAssert.md) | interface | Deprecated marker for disabling write-processing assertions. |

## Sub-packages

This package has several sub-packages (documented separately when in the API surface):
- `com.hypixel.hytale.component.system` -- system base classes (`EcsEvent`, `RefSystem`, `EntityTickingSystem`, etc.)
- `com.hypixel.hytale.component.event` -- ECS event type handles (`EntityEventType`, `WorldEventType`)
- `com.hypixel.hytale.component.query` -- query combinators (`AndQuery`, `OrQuery`, `NotQuery`, etc.)
- `com.hypixel.hytale.component.dependency` -- system ordering (`Dependency`, `DependencyGraph`, `Order`)
- `com.hypixel.hytale.component.spatial` -- spatial indexing (`SpatialResource`, `KDTree`, `MortonCode`)
- `com.hypixel.hytale.component.data` -- internal data structures
- `com.hypixel.hytale.component.metric` -- performance metrics
- `com.hypixel.hytale.component.task` -- parallel task infrastructure
