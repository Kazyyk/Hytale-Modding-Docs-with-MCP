---
title: "ImportedMaterialProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.ImportedMaterialProviderAsset"
api_surface: false
extends: "MaterialProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "material"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders`

```java
public class ImportedMaterialProviderAsset extends MaterialProviderAsset
```

References a material provider exported by another asset via its name. Resolves the export at build time using `MaterialProviderAsset.getExportedAsset()`.
