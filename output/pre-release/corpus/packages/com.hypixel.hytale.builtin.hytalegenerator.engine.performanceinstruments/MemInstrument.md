# MemInstrument

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments

public interface MemInstrument

Defines the contract for memory usage reporting. Implemented throughout the buffer bundle hierarchy to enable aggregate memory tracking. Provides standard size constants for common Java object types used in memory calculations.

## Inner Types

- MemInstrument.Report | record | Wraps a memory size in bytes

## Fields

- static final long BYTES_IN_MEGABYTES
- static final long INT_SIZE
- static final long DOUBLE_SIZE
- static final long BOOLEAN_SIZE
- static final long OBJECT_REFERENCE_SIZE
- static final long OBJECT_HEADER_SIZE
- static final long ARRAY_HEADER_SIZE
- static final long CLASS_OBJECT_SIZE
- static final long ARRAYLIST_OBJECT_SIZE
- static final long VECTOR3I_SIZE
- static final long VECTOR3D_SIZE
- static final long HASHMAP_ENTRY_SIZE

## Methods

- @Nonnull MemInstrument.Report getMemoryUsage()

Known implementors: Access, ArrayContents, ArrayContents, Bounds3d, Bounds3i, Buffer, BufferBundle, CountedArrayContents, EntityPlacementData, Grid, TrackedBuffer, Tracker

Also in this package: Probe, Report, State, TimeInstrument

Complete API:
  MemInstrument.Report getMemoryUsage()

Fields:
long BYTES_IN_MEGABYTES
long INT_SIZE
long DOUBLE_SIZE
long BOOLEAN_SIZE
long OBJECT_REFERENCE_SIZE
long OBJECT_HEADER_SIZE
long ARRAY_HEADER_SIZE
long CLASS_OBJECT_SIZE
long ARRAYLIST_OBJECT_SIZE
long VECTOR3I_SIZE
long VECTOR3D_SIZE
long HASHMAP_ENTRY_SIZE
