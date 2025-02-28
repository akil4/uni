# **PATTERNS**

## Square

    #####           i=0;i<n;i++
    #####               j=0;j<n;j++
    #####                   "#"
    #####               line
    #####

## Triangle

### BottomLeft

    #               i=0;i<n;i++
    ##                  j=0;j<i;j++
    ###                     "#"
    ####                line
    #####           

### TopLeft

    #####           i=0;i<n;i++
    ####                j=0;j<n-i;j++
    ###                     "#"
    ##                  line
    #

### TopRight

    #####           i=0;i<n;i++
     ####               j=0;j<i;j++
      ###                   " "
       ##               j=0;j<n;j++
        #                   "#"
                        line

### BottomRight

        #
       ##
      ###
     ####
    #####

## K

    #####           i=0;i<n;i++
    ####                j=0;j<n-i;j++
    ###                     "#"
    ##                  line
    #              i=0;i<n;i++
    #                   j=0;j<i;j++
    ##                       "#"
    ###                  line
    ####
    #####