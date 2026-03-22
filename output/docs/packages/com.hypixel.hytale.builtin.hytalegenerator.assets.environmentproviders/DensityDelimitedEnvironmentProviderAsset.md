---
title: "DensityDelimitedEnvironmentProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders.DensityDelimitedEnvironmentProviderAsset"
api_surface: false
extends: "EnvironmentProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "environmentproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders`

```java
public class DensityDelimitedEnvironmentProviderAsset extends EnvironmentProviderAsset
```

Asset definition for DensityDelimitedEnvironmentProvider configuration data.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `DensityDelimitedEnvironmentProviderAsset.DelimiterAsset[]` | `delimiterAssets` | `new DensityDelimitedEnvironmentProviderAsset.DelimiterAsset[0]` |
| `private` | `DensityAsset` | `densityAsset` | `DensityAsset.getFallbackAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `EnvironmentProvider` | `build(@Nonnull EnvironmentProviderAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
