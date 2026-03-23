# FillerBlockUtil

Type: class | Package: com.hypixel.hytale.server.core.util

public class FillerBlockUtil

Utility class for managing filler blocks -- the auxiliary blocks that occupy the bounding box of multi-block structures (blocks whose hitbox extends beyond a single unit cube). Handles creation, removal, validation, and iteration of filler blocks relative to a base block position.

Filler coordinates are packed into a single `int` using 5 bits per axis (x, z, y) with sign extension, supporting offsets in the range -16 to +15.

## Static Fields

- THRESHOLD | float | Default overlap threshold: `0.0`.
- NO_FILLER | int | Packed value representing no filler offset: `0`.

## Key Static Methods

- forEachFillerBlock(BlockBoundingBoxes.RotatedVariantBoxes, TriIntConsumer) | void | Iterates over all block positions within a bounding box.
- forEachFillerBlock(float, int, int, int, BlockBoundingBoxes.RotatedVariantBoxes, TriIntConsumer) | void | Iterates with configurable threshold and per-axis expansion.
- testFillerBlocks(BlockBoundingBoxes.RotatedVariantBoxes, TriIntPredicate) | boolean | Tests a predicate against all filler positions; returns false on first failure.
- validateBlock(int, int, int, int, int, int, A, B, FillerFetcher) | ValidationResult | Validates filler block integrity: checks base block existence, type match, and bounding box containment.
- removeFillerBlocksAt(ComponentAccessor, BlockSection, int, int, int, int, int, int, ChangeReason) | void | Removes all filler blocks associated with a base block, handling cross-section boundaries asynchronously.
- setFillerBlocksAt(ComponentAccessor, Ref, BlockSection, int, int, int, int, int, int, ChangeReason) | void | Places filler blocks for a base block, removing old fillers if overwriting.
- pack(int, int, int) | int | Packs x, y, z offsets into a single int.
- unpackX(int) | int | Extracts sign-extended x offset from packed value.
- unpackY(int) | int | Extracts sign-extended y offset from packed value.
- unpackZ(int) | int | Extracts sign-extended z offset from packed value.

## Inner Types

- ChangeReason | Enum: reason for filler change (NONE, NORMAL, BY_PHYSICS).
- FillerFetcher | Functional interface for reading block, filler, and rotation data.
- ValidationResult | Enum: OK, INVALID_BLOCK, INVALID_FILLER.
