---
title: "FeatureEvaluatorHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.FeatureEvaluatorHelper"
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

```java
public class FeatureEvaluatorHelper
```

Manages feature provider evaluation for builders. Tracks a list of provider evaluators, supports locking (making the list immutable), and validates that referenced features are provided and component requirements are met. Used to ensure that actions and motions in the NPC behavior tree have access to the target types they need (Player, NPC, Position, etc.).

## Constructors

```java
public FeatureEvaluatorHelper()
public FeatureEvaluatorHelper(boolean couldRequireFeature)
```

## Methods

### add

```java
public void add(ProviderEvaluator evaluator)
```

Adds a provider evaluator. Must be called before `lock()`.

### canAddProvider

```java
public boolean canAddProvider()
```

Returns `true` if the helper has not been locked.

### lock

```java
@Nonnull
public FeatureEvaluatorHelper lock()
```

Makes the evaluator list immutable and returns `this`.

### setContainsReference

```java
public void setContainsReference()
```

Marks that this helper contains a provider reference that needs deferred validation.

### getProviders

```java
@Nonnull
public List<ProviderEvaluator> getProviders()
```

### validateProviderReferences

```java
public void validateProviderReferences(BuilderManager manager, ExecutionContext context)
```

Validates all registered provider reference validators.

### validateComponentRequirements

```java
public void validateComponentRequirements(FeatureEvaluatorHelper providers, ExecutionContext context)
```

Validates that all component requirements are satisfied by the given providers.

### addProviderReferenceValidator / addComponentRequirementValidator

```java
public void addProviderReferenceValidator(BiConsumer<BuilderManager, ExecutionContext> referenceValidator)
public void addComponentRequirementValidator(BiConsumer<FeatureEvaluatorHelper, ExecutionContext> validator)
```

### disallowParameterProviders / isDisallowParameterProviders

```java
public void disallowParameterProviders()
public boolean isDisallowParameterProviders()
```

## Related Types

- [Feature](Feature.md) -- the feature enum
- [Builder](Builder.md) -- `getEvaluatorHelper()` returns this type
- [BuilderValidationHelper](BuilderValidationHelper.md) -- carries this helper
