---
title: "UnconditionalFeatureProviderEvaluator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators.UnconditionalFeatureProviderEvaluator"
api_surface: false
extends: null
implements: ["FeatureProviderEvaluator"]
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
public class UnconditionalFeatureProviderEvaluator implements FeatureProviderEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Feature` | `feature` |
| `private final` | `String` | `description` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `provides(EnumSet<Feature> feature)` |
| `@Override public` | `void` | `resolveReferences(BuilderManager manager)` |
