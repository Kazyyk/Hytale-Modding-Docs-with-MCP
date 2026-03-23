---
title: "UnconditionalParameterProviderEvaluator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.providerevaluators.UnconditionalParameterProviderEvaluator"
api_surface: false
extends: null
implements: ["ParameterProviderEvaluator"]
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
public class UnconditionalParameterProviderEvaluator implements ParameterProviderEvaluator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<String,ParameterType>` | `parameters` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `hasParameter(String parameter, ParameterType type)` |
| `@Override public` | `void` | `resolveReferences(BuilderManager builderManager)` |
