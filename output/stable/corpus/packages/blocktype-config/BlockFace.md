# BlockFace

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Enumerates all 26 possible block face directions (6 cardinal + 12 edge + 8 corner). Each face has a direction vector, a `FaceConnectionType` for rotation semantics, and mappings to/from protocol `BlockNeighbor` values. Provides rotation, flipping, and lookup operations. Inner enum `FaceConnectionType` defines rotation categories: `FLIP`, `ROTATE_X`, `ROTATE_Y`, `ROTATE_Z`, `ROTATE_ALL`.
