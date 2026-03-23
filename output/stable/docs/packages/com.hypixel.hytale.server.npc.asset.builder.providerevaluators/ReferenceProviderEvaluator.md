---
title: "ReferenceProviderEvaluator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators.ReferenceProviderEvaluator"
api_surface: false
extends: null
implements: ["FeatureProviderEvaluator", "ParameterProviderEvaluator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "asset"
  - "builder"
  - "providerevaluators"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.providerevaluators`

```java
public class ReferenceProviderEvaluator implements FeatureProviderEvaluator, ParameterProviderEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `referenceIndex` |
| `private final` | `Class<?>` | `classType` |
| `private` | `FeatureEvaluatorHelper` | `resolvedProviderSet` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `provides(EnumSet<Feature> feature)` |
| `@Override public` | `boolean` | `hasParameter(String parameter, ParameterType type)` |
| `@Override public` | `void` | `resolveReferences(BuilderManager manager)` |
