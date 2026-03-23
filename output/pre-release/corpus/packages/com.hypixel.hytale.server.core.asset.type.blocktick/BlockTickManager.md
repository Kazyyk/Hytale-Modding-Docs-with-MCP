# BlockTickManager

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktick

@Deprecated(forRemoval = true)
public final class BlockTickManager

Utility type in the `blocktick` subsystem.

## Accessors

- setBlockTickProvider(IBlockTickProvider provider) | void | Mutator method.
- getBlockTickProvider() | IBlockTickProvider | Accessor method.
- hasBlockTickProvider() | boolean | Boolean accessor.

Also in this package: BlockTickStrategy, IBlockTickProvider

Complete API:
  public static void setBlockTickProvider(IBlockTickProvider provider)
  public static IBlockTickProvider getBlockTickProvider()
  public static boolean hasBlockTickProvider()

Fields:
private static final AtomicReference<IBlockTickProvider> BLOCK_TICK_PROVIDER
