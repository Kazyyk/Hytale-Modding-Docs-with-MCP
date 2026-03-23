# MtlParser

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport

public final class MtlParser

Parses Wavefront MTL material library files. Extracts material names, diffuse colors (`Kd`), and diffuse texture paths (`map_Kd`). The constructor is private; access is through the static `parse` method.

## Methods

- parse(Path) | Map<String, MtlMaterial> | Parses an MTL file and returns a map of material name to material data.

## Inner Types

### MtlMaterial (record)

Parsed material data.

- name | String | Material name.
- diffuseColor | float[] | RGB diffuse color in [0,1] range, or null.
- diffuseTexturePath | String | Path to the diffuse texture, or null.

- getDiffuseColorRGB() | int[] | Returns the diffuse color as [0,255] RGB, or null if no color set.

## See Also

- ObjParser
- ObjImportPage
