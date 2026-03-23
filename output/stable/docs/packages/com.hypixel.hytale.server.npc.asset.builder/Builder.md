---
title: "Builder"
kind: "interface"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.Builder"
api_surface: false
extends: ~
implements:
  - "BuilderContext"
  - "SchemaConvertable<Void>"
  - "NamedSchema"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public interface Builder<T> extends BuilderContext, SchemaConvertable<Void>, NamedSchema
```

The core interface for all NPC asset builders in the JSON-driven NPC configuration system. A `Builder<T>` reads JSON configuration, validates it, and produces a runtime object of type `T` (such as a Role, Action, Sensor, BodyMotion, HeadMotion, or Instruction). Every builder participates in the full lifecycle: configuration reading, load-time validation, dependency tracking, feature evaluation, and schema generation.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type this builder produces. |

## Methods

### build

```java
@Nullable
T build(BuilderSupport var1);
```

Constructs the runtime object from the previously read configuration. Returns `null` if the builder cannot produce a valid instance.

### validate

```java
boolean validate(String var1, NPCLoadTimeValidationHelper var2, ExecutionContext var3, Scope var4, List<String> var5);
```

Performs load-time validation of the builder's configuration. Returns `true` if valid. Errors are appended to the provided list.

### readConfig

```java
void readConfig(BuilderContext var1, JsonElement var2, BuilderManager var3, BuilderParameters var4, BuilderValidationHelper var5);
```

Reads JSON configuration data into the builder's internal state.

### ignoreAttribute

```java
void ignoreAttribute(String var1);
```

Marks a JSON attribute name as expected so it is not flagged as unknown during post-read validation.

### category

```java
Class<T> category();
```

Returns the class object representing this builder's category (e.g., `Role.class`, `Action.class`).

### setTypeName / getTypeName

```java
void setTypeName(String var1);
String getTypeName();
```

Sets and retrieves the type discriminator name used to select this builder from a [BuilderFactory](BuilderFactory.md).

### setLabel

```java
void setLabel(String var1);
```

Sets a label for breadcrumb-based error reporting.

### toSchema

```java
@Nonnull
@Override
Schema toSchema(@Nonnull SchemaContext var1);
```

Generates a JSON Schema representation of this builder's configuration format.

### getDescriptor

```java
BuilderDescriptor getDescriptor(String var1, String var2, BuilderManager var3);
```

Returns a [BuilderDescriptor](BuilderDescriptor.md) describing this builder's schema for documentation and validation generation.

### isDeprecated

```java
default boolean isDeprecated()
```

Returns `true` if the builder's [BuilderDescriptorState](BuilderDescriptorState.md) is `Deprecated`. Delegates to `getBuilderDescriptorState()`.

### getBuilderDescriptorState

```java
@Nullable
BuilderDescriptorState getBuilderDescriptorState();
```

Returns the lifecycle state of this builder (Unknown, WorkInProgress, Experimental, Stable, or Deprecated).

### getDependencies

```java
IntSet getDependencies();
```

Returns the set of builder indices this builder depends on.

### hasDynamicDependencies / addDynamicDependency / getDynamicDependencies / clearDynamicDependencies

```java
default boolean hasDynamicDependencies()
default void addDynamicDependency(int builderIndex)
@Nullable
default IntSet getDynamicDependencies()
default void clearDynamicDependencies()
```

Dynamic dependency management for builders that resolve references at build time rather than at read time. The default implementations throw `IllegalStateException` on `addDynamicDependency` and return `null`/`false`/no-op for the others. Overridden by [SpawnableWithModelBuilder](SpawnableWithModelBuilder.md).

### getBuilderParameters

```java
BuilderParameters getBuilderParameters();
```

Returns the [BuilderParameters](BuilderParameters.md) containing parameter definitions and scope for this builder.

### getEvaluatorHelper

```java
FeatureEvaluatorHelper getEvaluatorHelper();
```

Returns the [FeatureEvaluatorHelper](FeatureEvaluatorHelper.md) used to evaluate feature providers.

### getStateMappingHelper

```java
StateMappingHelper getStateMappingHelper();
```

Returns the [StateMappingHelper](StateMappingHelper.md) used for state machine index management.

### getInstructionContextHelper

```java
InstructionContextHelper getInstructionContextHelper();
```

Returns the [InstructionContextHelper](InstructionContextHelper.md) used for instruction context validation.

### canRequireFeature

```java
boolean canRequireFeature();
```

Returns `true` if this builder's category supports feature requirements (Actions and Motions).

### validateReferencedProvidedFeatures

```java
void validateReferencedProvidedFeatures(BuilderManager var1, ExecutionContext var2);
```

Validates that all referenced feature providers are satisfied.

### excludeFromRegularBuilding

```java
boolean excludeFromRegularBuilding();
```

Returns `true` if this builder should be skipped during regular build passes.

### isEnabled

```java
boolean isEnabled(ExecutionContext var1);
```

Returns `true` if this builder is enabled in the given execution context.

### isSpawnable

```java
default boolean isSpawnable()
```

Returns `true` if this builder produces a spawnable entity. Defaults to `false`.

## Related Types

- [BuilderBase](BuilderBase.md) -- abstract base implementation of this interface
- [BuilderFactory](BuilderFactory.md) -- creates builders by type discriminator
- [BuilderContext](BuilderContext.md) -- parent interface for breadcrumb navigation
- [BuilderSupport](BuilderSupport.md) -- runtime context passed during build
- [BuilderManager](BuilderManager.md) -- manages loading and validation of builders
- [BuilderDescriptorState](BuilderDescriptorState.md) -- lifecycle state enum
- [BuilderParameters](BuilderParameters.md) -- parameter definitions and scope
