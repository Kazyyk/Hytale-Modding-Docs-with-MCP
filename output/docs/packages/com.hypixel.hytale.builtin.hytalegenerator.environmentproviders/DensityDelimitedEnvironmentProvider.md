---
title: "DensityDelimitedEnvironmentProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.environmentproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.environmentproviders.DensityDelimitedEnvironmentProvider"
api_surface: false
extends: "EnvironmentProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "environmentproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.environmentproviders`

```java
public class DensityDelimitedEnvironmentProvider extends EnvironmentProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `List<DelimiterDouble<EnvironmentProvider>>` | `delimiters` |
| `private final` | `Density` | `density` |
| `private final` | `Density.Context` | `rDensityContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getValue(EnvironmentProvider.Context context)` |
