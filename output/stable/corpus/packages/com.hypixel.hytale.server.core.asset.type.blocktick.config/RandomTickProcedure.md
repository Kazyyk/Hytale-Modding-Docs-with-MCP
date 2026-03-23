# RandomTickProcedure

Type: interface | Package: com.hypixel.hytale.server.core.asset.type.blocktick.config

public interface RandomTickProcedure

Utility type in the `config` subsystem.

## Abstract Methods

- onRandomTick | void | Store<ChunkStore> var1, CommandBuffer<ChunkStore> var2, BlockSection var3, int var4, int var5, int var6, int var7, BlockType var8

Known implementors: ChangeIntoBlockProcedure, SpreadToProcedure

Also in this package: TickProcedure

Complete API:
  void onRandomTick(Store<ChunkStore> var1, CommandBuffer<ChunkStore> var2, BlockSection var3, int var4, int var5, int var6, int var7, BlockType var8)

Fields:
CodecMapCodec<RandomTickProcedure> CODEC
