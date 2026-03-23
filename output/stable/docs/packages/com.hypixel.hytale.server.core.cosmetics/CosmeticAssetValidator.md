---
title: "CosmeticAssetValidator"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.CosmeticAssetValidator"
api_surface: false
extends: ~
implements: ["Validator<String>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "cosmetics"
---

**Package:** `com.hypixel.hytale.server.core.cosmetics`

```java
public class CosmeticAssetValidator implements Validator<String>
```

Validates cosmetic assets for consistency and completeness during loading.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `accept(@Nullable String asset, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
