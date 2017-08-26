package de.oheoh.oheohOres.blocks;

import de.oheoh.oheohOres.handlers.CreativeTabsHandler;
import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/

public class OheriumOre extends Block {
    public OheriumOre() {
        super(Material.ROCK);
        setUnlocalizedName("ohrium_ore");
        setRegistryName("oherium_ore");
        setHardness(4F);
        setResistance(20F);
        setCreativeTab(CreativeTabsHandler.oheohOresBlocks);
        setHarvestLevel("pickaxe", 3);
        this.drop = OoItems.oheriumDust;
        this.meta = 0;
        this.quant = 1;
    }

    private Item drop;
    private int meta;
    private int quant;

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.drop;
    }

    @Override
    public int quantityDropped(Random random) {
        return this.quant;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return this.meta;
    }
}
