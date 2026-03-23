---
title: "com.hypixel.hytale.builtin.buildertools.objimport"
---

## Package `com.hypixel.hytale.builtin.buildertools.objimport`

OBJ model import pipeline for builder tools. Parses Wavefront OBJ/MTL files, voxelizes triangle meshes into block grids, and provides a UI page for interactive import with texture/material support.

| Type | Kind | Description |
|---|---|---|
| [MeshVoxelizer](MeshVoxelizer.md) | class | Converts triangle meshes to 3D voxel grids with block ID mapping. |
| [MtlParser](MtlParser.md) | class | Parses Wavefront MTL material library files. |
| [ObjImportCommand](ObjImportCommand.md) | class | `/importobj` command that opens the import UI. |
| [ObjImportPage](ObjImportPage.md) | class | Interactive UI page for OBJ import with full configuration. |
| [ObjParser](ObjParser.md) | class | Parses Wavefront OBJ files into mesh data. |
| [TextureSampler](TextureSampler.md) | class | Texture loading, sampling, and color averaging utility. |
