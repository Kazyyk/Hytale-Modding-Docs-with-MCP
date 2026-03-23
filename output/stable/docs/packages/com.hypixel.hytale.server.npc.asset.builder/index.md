---
title: "com.hypixel.hytale.server.npc.asset.builder"
kind: "package"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

Implements the JSON-driven builder/factory system for NPC configuration. NPC roles are defined in JSON files under `Server/NPC/Roles/`. The [BuilderManager](BuilderManager.md) loads these files, selects the appropriate [BuilderFactory](BuilderFactory.md) by category, and instantiates typed builders that read JSON, validate it, and produce runtime objects (Roles, Actions, Sensors, BodyMotions, HeadMotions, Instructions, etc.).

The package also provides the infrastructure for expression-evaluated parameters, state machine mapping, feature provider evaluation, slot allocation, and schema generation.

## Core Builder Types

| Type | Kind | Description |
|---|---|---|
| [Builder](Builder.md) | interface | The root interface for all NPC asset builders. |
| [BuilderBase](BuilderBase.md) | abstract class | Abstract base implementation with attribute reading infrastructure. |
| [BuilderBaseWithType](BuilderBaseWithType.md) | abstract class | Adds a secondary `Type` field; implements `ISpawnable`. |
| [SpawnableWithModelBuilder](SpawnableWithModelBuilder.md) | abstract class | Extends `BuilderBase` for spawnable entities with models and dynamic dependencies. |
| [BuilderComponent](BuilderComponent.md) | class | Generic component wrapper; automatically registered by every factory. |

## Factory and Management

| Type | Kind | Description |
|---|---|---|
| [BuilderFactory](BuilderFactory.md) | class | Creates builders by type discriminator from a named registry. |
| [BuilderManager](BuilderManager.md) | class | Central manager for loading, caching, validating, and hot-reloading builders. |
| [BuilderInfo](BuilderInfo.md) | class | Metadata about a loaded builder (index, name, path, validation state). |

## Object Helpers (JSON Reading)

| Type | Kind | Description |
|---|---|---|
| [BuilderObjectHelper](BuilderObjectHelper.md) | abstract class | Base for helpers that read JSON and produce typed objects. |
| [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) | class | Resolves inline, file, or internal builder references. |
| [BuilderObjectArrayHelper](BuilderObjectArrayHelper.md) | abstract class | Reads JSON arrays of builder objects. |
| [BuilderObjectListHelper](BuilderObjectListHelper.md) | class | Produces a `List<T>` from a JSON array. |
| [BuilderObjectMapHelper](BuilderObjectMapHelper.md) | class | Produces a `Map<K, V>` from a JSON array with key extraction. |
| [BuilderObjectStaticHelper](BuilderObjectStaticHelper.md) | class | Enforces inline-only (no references). |
| [BuilderObjectStaticListHelper](BuilderObjectStaticListHelper.md) | class | List of inline-only builders. |
| [BuilderCodecObjectHelper](BuilderCodecObjectHelper.md) | class | Reads JSON via a `Codec<T>`. |
| [BuilderCombatConfig](BuilderCombatConfig.md) | class | Combat configuration with runtime override. |
| [BuilderTemplateInteractionVars](BuilderTemplateInteractionVars.md) | class | Interaction variable maps with runtime override. |

## Parameters, Modifiers, and Context

| Type | Kind | Description |
|---|---|---|
| [BuilderParameters](BuilderParameters.md) | class | Parameter definitions, expression scope, and dependency tracking. |
| [BuilderModifier](BuilderModifier.md) | class | `"Modify"` block: parameter overrides, state exports, combat config, interaction vars. |
| [EmptyBuilderModifier](EmptyBuilderModifier.md) | class | Singleton null-object modifier. |
| [BuilderContext](BuilderContext.md) | interface | Hierarchical breadcrumb context for error reporting. |
| [BuilderSupport](BuilderSupport.md) | class | Runtime context during `build()`: entity, slots, instructions, events, state. |
| [BuilderValidationHelper](BuilderValidationHelper.md) | class | Bundles validation context objects. |

## Schema and Descriptors

| Type | Kind | Description |
|---|---|---|
| [BuilderDescriptor](BuilderDescriptor.md) | class | Builder schema for documentation/validation generation. |
| [BuilderAttributeDescriptor](BuilderAttributeDescriptor.md) | class | Single attribute schema with fluent configuration. |
| [BuilderDescriptorState](BuilderDescriptorState.md) | enum | Lifecycle state: Unknown, WorkInProgress, Experimental, Stable, Deprecated. |

## Slot Mappers

| Type | Kind | Description |
|---|---|---|
| [SlotMapper](SlotMapper.md) | class | Maps names to sequential integer slots. |
| [ReferenceSlotMapper](ReferenceSlotMapper.md) | class | Extends `SlotMapper` with lazily-created reference objects. |
| [EventSlotMapper](EventSlotMapper.md) | class | Allocates event observation slots by type and set. |

## State Machine Support

| Type | Kind | Description |
|---|---|---|
| [StateMappingHelper](StateMappingHelper.md) | class | Two-level state name/index mapping with validation. |
| [StatePair](StatePair.md) | class | Immutable (fullStateName, mainIndex, subIndex) tuple. |

## Feature Evaluation

| Type | Kind | Description |
|---|---|---|
| [Feature](Feature.md) | enum | Target types: Player, NPC, Drop, Position, Path. |
| [FeatureEvaluatorHelper](FeatureEvaluatorHelper.md) | class | Manages feature provider evaluation and requirements. |

## Instruction Context

| Type | Kind | Description |
|---|---|---|
| [InstructionType](InstructionType.md) | enum | Instruction contexts: Default, Interaction, Death, Component, StateTransitions. |
| [ComponentContext](ComponentContext.md) | enum | Sensor contexts: SensorSelf, SensorTarget, SensorEntity. |
| [InstructionContextHelper](InstructionContextHelper.md) | class | Validates instruction/component context compatibility. |

## Reference Resolution

| Type | Kind | Description |
|---|---|---|
| [InternalReferenceResolver](InternalReferenceResolver.md) | class | Resolves local builder references within a file; detects cycles. |

## Sub-packages

This package has several sub-packages (documented separately):

- `expression` -- Expression types for dynamic JSON values (static and dynamic boolean, number, string, and array expressions).
- `holder` -- Typed value holder classes for validated field storage.
- `providerevaluators` -- Feature and parameter provider evaluators.
- `validators` -- Attribute and asset validators.
- `util` -- Utility classes.
