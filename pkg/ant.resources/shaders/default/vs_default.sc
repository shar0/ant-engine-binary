@VSINPUT_VARYING_DEFINE
@VSINPUTOUTPUT_STRUCT

#include <bgfx_shader.sh>
#include <shaderlib.sh>

@VS_PROPERTY_DEFINE

#include "common/transform.sh"
#include "common/common.sh"

@VS_FUNC_DEFINE

void main()
{
    VSInput vsinput = (VSInput)0;
    Varyings varyings = (Varyings)0;

@VSINPUT_INIT

    mat4 worldmat = (mat4)0;
    gl_Position = CUSTOM_VS_POSITION(vsinput, varyings, worldmat);
#ifndef POSITION_ONLY
    CUSTOM_VS(worldmat, vsinput, varyings);
#endif //POSITION_ONLY

@OUTPUT_VARYINGS
}