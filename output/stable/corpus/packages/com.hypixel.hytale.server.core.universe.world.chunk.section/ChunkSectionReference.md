# ChunkSectionReference

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section

public class ChunkSectionReference

A simple holder binding a `BlockChunk`, `BlockSection`, and section index together. Used as a convenience type for passing section context between methods that need access to both the parent chunk and a specific section.

## Constructors


public ChunkSectionReference(BlockChunk chunk, BlockSection section, int sectionIndex)

## Instance Methods


public BlockChunk getChunk()


public BlockSection getSection()


public int getSectionIndex()
