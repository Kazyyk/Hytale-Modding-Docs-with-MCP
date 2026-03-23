---
title: "MtlParser"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.objimport"
fqcn: "com.hypixel.hytale.builtin.buildertools.objimport.MtlParser"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "obj-import"
  - "materials"
  - "parser"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.objimport`

```java
public final class MtlParser
```

Parses Wavefront MTL material library files. Extracts material names, diffuse colors (`Kd`), and diffuse texture paths (`map_Kd`). The constructor is private; access is through the static `parse` method.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `parse(Path)` | `Map<String, MtlMaterial>` | Parses an MTL file and returns a map of material name to material data. |

## Inner Types

### MtlMaterial (record)

Parsed material data.

| Field | Type | Description |
|---|---|---|
| `name` | `String` | Material name. |
| `diffuseColor` | `float[]` | RGB diffuse color in [0,1] range, or null. |
| `diffuseTexturePath` | `String` | Path to the diffuse texture, or null. |

| Method | Return Type | Description |
|---|---|---|
| `getDiffuseColorRGB()` | `int[]` | Returns the diffuse color as [0,255] RGB, or null if no color set. |

## See Also

- [ObjParser](ObjParser.md)
- [ObjImportPage](ObjImportPage.md)
